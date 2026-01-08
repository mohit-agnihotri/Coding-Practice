class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length())
            return false;
        String check = s + s;
        for (int i = 0; i < check.length() - goal.length(); i++) {
            if (check.substring(i, i + goal.length()).equals(goal)) {
                return true;
            }
        }
        return false;
    }
}