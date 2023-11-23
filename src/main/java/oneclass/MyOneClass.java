package oneclass;

public class MyOneClass {

        public String tamilMethod() {
            return "This is a tamil method.";
        }

        public static String englishMethod() {
            return "This is a english method.";
        }

        public int binarySearch(int arr[], int x)
        {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (arr[m] == x)
                    return m;
                if (arr[m] < x)
                    l = m + 1;
                else
                    r = m - 1;
            }
            return -1;
        }
   private boolean mypalindrome(String s) {
       String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       int length = cleanStr.length();

       for (int i = 0; i < length / 2; i++) {
           if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
               return false;
           }
       }

       return true;

   }
   public static String reverseWord(){
       String originalString = "Hello";
       String reversedString = "";

       for (int i = 0; i < originalString.length(); i++) {
           reversedString = originalString.charAt(i) + reversedString;
       }

       System.out.println("Reversed string: "+ reversedString);
       return originalString;
   }
}


