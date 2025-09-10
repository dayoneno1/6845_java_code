package Arrays;

public class W13_02_basicArray {

    public static void main(String[] args) {

        //การประกาศตัวแปรแบบArray แบบที่1 ระบุสมาชิกในวงเล็บปีกกา
        // Sttring [] animals;
        String animals [] = {"Dog", "Cat", "Lion"};
        int dice[] = {1, 2, 3, 4, 5, 6};
        float avgScore[]= {3.50f, 4.00f, 2.75f};

        //หาขนาด ของ Array
        System.out.println("Size of animals array : " + animals.length);

        //การเข้าถึงสมาชิกใน Array
        System.out.println("Color at index 0 : + animals[0]");
        System.out.println("Color at index 2 : + animals[2]");

        // วนลูปแสดงสมาชิกใน Arrray avgScore
        System.out.println("Show all average scors : ");
        for(int i=0;i < avgScore.length ;i++){
            System.out.println(avgScore[1]);    

        }
    //=========================================================================================
        
        // การประกาศตัวแปณแบบ Array แบบที่ 2 ระบุขนาดของ Array
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";
        
        
        System.out.println("Size of animals array : " + colors.length);

        System.out.println("Color at index 0 : + colors[0]");
        System.out.println("Color at index 1 : + colors[1]");
        
        
        int scores[] = new int[5];
        scores[0] =50;

        System.out.println("Score at index 4 :" + scores[4]);
    }
}
