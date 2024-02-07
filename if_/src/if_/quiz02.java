package if_;

import java.util.Scanner;

public class quiz02 {
   public static void main(String[] args) {
	   // 오승민(4조 3번)
      Scanner sc = new Scanner(System.in);
      String result1, result2 ;


      System.out.println("첫번째 사람 가위 바위 보 입력 :");
      result1 = sc.next();
      System.out.println("두번째 사람 가위 바위 보 입력 :");
      result2 = sc.next();



      if(("가위".equals(result2) || "바위".equals(result2) || "보".equals(result2))
            && ("가위".equals(result1) || "바위".equals(result1) || "보".equals(result1))){
         if(result1.equals(result2)) {
            System.out.println("무승부");
         }else if("가위".equals(result1)){
            if("보".equals(result2)) {
               System.out.println("첫번째 사람 승");
            }else {
               System.out.println("두번째 사람 승");
            }
         }else if("바위".equals(result1)){
            if("가위".equals(result2)) {
               System.out.println("첫번째 사람 승");
            }else {
               System.out.println("두번째 사람 승");
            }
         }
         else if("보".equals(result1)){
            if("바위".equals(result2)) {
               System.out.println("첫번째 사람 승");
            }else {
               System.out.println("두번째 사람 승");
            }
         }
      } else {
         System.out.println("잘못 입력하셨습니다.");
      }
   }
}
