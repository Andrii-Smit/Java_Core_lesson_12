package task2;

import java.util.Arrays;

public class MyArrayList {

	private String[] elementData;
	private int size;

	public MyArrayList() {
		this.size = 10;
		this.elementData = new String[this.size];
	}

	public MyArrayList(int size) {
		this.size = size;
		this.elementData = new String[this.size];
	}

	public void add(String value) {
		int dataSize = 0;

		for (int i = 0; i < elementData.length; i++) {
			if (elementData[i] != null) {
				dataSize++;
			}
		}

		if ((dataSize + 1) > elementData.length) {
			String[] newElementData = new String[(elementData.length * 3) / 2 + 1];

			for (int i = 0; i < elementData.length; i++) {
				newElementData[i] = elementData[i];
			}

			elementData = newElementData;
			size = newElementData.length;
		}

		elementData[dataSize++] = value;
	}

	public String remove(int index) {
		String removedValue = elementData[index];

		String[] newElementData = new String[elementData.length - 1];

		for (int i = 0; i < index; i++) {
			newElementData[i] = elementData[i];
		}

		for (int i = index; i < elementData.length - 1; i++) {
			newElementData[i] = elementData[i + 1];
		}

		elementData = newElementData;
		size = newElementData.length;

		return removedValue;
	}

	@Override
	public String toString() {
		return "MyArrayList [elementData=" + Arrays.toString(elementData) + ", size=" + size + "]";
	}
}