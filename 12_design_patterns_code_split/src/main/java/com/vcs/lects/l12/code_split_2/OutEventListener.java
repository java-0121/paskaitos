package com.vcs.lects.l12.code_split_2;

public interface OutEventListener {

	void onBeginEvent(String msg);

	void onIterateItem(String item);

	void onIterateValid(String item);

	void onIterateNotValid(String item);

	void onEndEvent(String msg);

}
