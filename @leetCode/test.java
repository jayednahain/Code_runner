
class test {
    public static void main(String[] args) {
        problems p344 = new problems();
        char[] tempp344 = { '1', '2', '3', '4', '5', '6', '7' };
        // p344.problem344(tempp344);

        problems p345 = new problems();
        String tempStringp344 = "leetcode";
        System.err.println(p345.problem345(tempStringp344));
    }
}

class problems {
    public void problem344(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            var temp = s[left];
            s[left] = s[right];
            left++;
            s[right] = temp;
            right--;
        }
    }

    public String problem345(String s) {
        String temS = s.toLowerCase();

        char[] arr = temS.toCharArray();
        char[] v = { 'a', 'e', 'i', 'o', 'u' };
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!vCheck(arr[left])) {
                System.out.println("left: " + left);
                left++;
            } else if (!vCheck(arr[right])) {
                System.out.println("right: " + right);
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }

    private boolean vCheck(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}