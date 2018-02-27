package hive.udf;

import java.util.List;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * 
 * This UDF will accept two arguments, one string separator and one array of
 * string arrayString. It will return a single string where all the elements of
 * the array are separated by the separator.
 *
 * 
 */
public class StringUDF extends UDF {
	//
	public String evaluate(String separator, List<String> arrayString) {
		String concatWordString = "";
		for (int i = 0; i < arrayString.size(); i++) {

			concatWordString = concatWordString + arrayString.get(i);
			if (i + 1 != arrayString.size())//check for removal of last separator
				concatWordString = concatWordString + separator;
		}
		return concatWordString;
	}

}