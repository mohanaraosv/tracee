package io.tracee.testhelper;

import java.util.Enumeration;

public final class EmptyEnumeration<T> implements Enumeration<T> {

	public static <T> EmptyEnumeration<T> emptyEnumeration() {
		return new EmptyEnumeration<>();
	}

	@Override
	public boolean hasMoreElements() {
		return false;
	}

	@Override
	public T nextElement() {
		return null;
	}
}
