package com.hello.mypackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.LongStream;

public class Main {
	
	public static void main(String[] args) {
		try {
			computeX(8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void computeX(long n) throws IOException {
		long init = System.currentTimeMillis();
		Collection<String> list = Collections.synchronizedCollection(new ArrayList<>());
		AtomicInteger iterationCount = new AtomicInteger(0);
		LongStream.range(0, n - 1).parallel().forEachOrdered(i -> {
			LongStream.range(i + 1, n).parallel().forEachOrdered(j -> {
				list.add("{" + i + "," + j + "}");
				Thread.currentThread();
				Thread.holdsLock(list);
				if (list.size() == n) {
					try {
						PrintWriter printWriter = new PrintWriter(new FileWriter("combination" + iterationCount.get()));
						printWriter.write(list.toString());
						printWriter.close();
						list.clear();
						iterationCount.getAndIncrement();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
		});
		PrintWriter printWriter = new PrintWriter(new FileWriter("combination" + iterationCount.get()));
		printWriter.write(list.toString());
		printWriter.close();
		System.out.printf("No. of files created: %d%nTime taken to compute %d combinations is %dms.", iterationCount.get() + 1, (((n * n) - n) / 2), (System.currentTimeMillis() - init));
	}
}
