package Two_Pointer_Approach;

public class ShortestToChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] result = shortestToChar(s, c);
        for (int dist : result) {
            System.out.print(dist + " ");
        }
        // Output: 3 2 1 0 1 0 0 1 2 2 1 0 [web:19]
    }

    static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];

        // Pass 1: Left to Right
        int lastSeen = -n;   // acts like "very far left"
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                lastSeen = i;
            }
            result[i] = i - lastSeen;
        }

        // Pass 2: Right to Left
        lastSeen = 2 * n;    // acts like "very far right"
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                lastSeen = i;
            }
            result[i] = Math.min(result[i], lastSeen - i);
        }

        return result;
    }
}
