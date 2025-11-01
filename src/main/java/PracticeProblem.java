class PracticeProblem {

    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3));  // 7
        System.out.println(towerOfHanoi(4));  // 15
        System.out.println(towerOfHanoi(2));  // -1
    }

    public static int towerOfHanoi(int num) {
        if (num < 3) return -1;
        if (num == 3) return 7;
        return 2 * towerOfHanoi(num - 1) + 1;
    }
}
