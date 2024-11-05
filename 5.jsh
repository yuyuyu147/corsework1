int[] average_grades(int[][] grades, int[] weights) {
    int[] avgGrades = new int[grades.length]; 
    for (int i = 0; i < grades.length; i++) { 
        int sum = 0; 
        for (int j = 0; j < grades[i].length; j++) { 
            sum += grades[i][j] * weights[j]; 
        }
        avgGrades[i] = sum / 100; 
    }

    return avgGrades;
}

int[] result = average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}}, new int[]{30, 40, 30});
System.out.println(java.util.Arrays.toString(result));