package db.sep_2019;

public class sep_25_392 {
    public boolean isSubsequence(String s, String t) {
        if (s== null && t == null || s.equals(""))
            return true;
        if (s== null || t == null  )
            return false;

        int lens = s.length();
        int count = 0;
        for (int i = 0; i < t.length(); i++){
            if (s.charAt(count) == t.charAt(i))
                count++;
            if (count == lens)
                return true;

        }
        return s.equals(t);
    }
}
