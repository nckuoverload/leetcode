class Solution {
    public List<String> letterCasePermutation(String S) {
		ArrayList<String> ans = new ArrayList<String>();
		if (S.charAt(0) > 57) {
			ans.add(Character.toLowerCase(S.charAt(0)) + "");
			ans.add(Character.toUpperCase(S.charAt(0)) + "");
		} else {
			ans.add(S.charAt(0) + "");
		}
		for (int i = 1; i < S.length(); i++) {
			int len = ans.size();
			if (S.charAt(i) > 57) {
				for (int b = 0; b < len; b++) {
					System.out.println(b);
					String t = ans.get(b);
					ans.set(b, ans.get(b) + Character.toLowerCase(S.charAt(i)));
					ans.add(t+Character.toUpperCase(S.charAt(i)));
				}
			} else {
				for (int a = 0; a < len; a++) {
					ans.set(a, ans.get(a) + (S.charAt(i)));
				}
			}
		}
        return ans;
    }
}
