package com.vcs.lects.l09.collections.task;

import java.util.List;
import java.util.Map;

public interface IReordering {

	/**
	 * 
	 * 
	 * @param mokiniai
	 *            - isrikiuoti pagal vardus
	 * @return turetu grazinti isrikiuotus pagal pazymiu vidurki reziais
	 * 
	 *         <pre>
	 * [0..1)
	 * [1..2)
	 * [2..3)
	 * [3..4)
	 * [4..5)
	 * [5..6)
	 * [6..7)
	 * [7..8)
	 * [8..9)
	 * [9..10] <-- 10'ukai imtinai!
	 * 
	 *         </pre>
	 */
	public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai);

}
