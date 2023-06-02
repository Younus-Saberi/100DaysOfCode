package arrays;

public class FlipImage {
    // https://leetcode.com/problems/flipping-an-image

        public int[][] flipAndInvertImage(int[][] image) {
            for(int[] row : image) {
                // reverse this array
                for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                    // swap
                    int temp = row[i] ^ 1;
                    row[i] = row[image[0].length - i - 1] ^ 1;
                    row[image[0].length - i - 1] = temp;
                }
            }
            return image;
        }
//    {[],[],[]}
    public static void main(String[] args) {
        FlipImage flipImage = new FlipImage();
        int[][] image = {{1,1,0},
                         {1,0,1},
                         {0,0,0}};
        int[][] result = flipImage.flipAndInvertImage(image);
        for(int[] row : result) {
            for(int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
