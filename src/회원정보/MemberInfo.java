package 회원정보;
import java.util.Scanner;
/*
이름 - 문자열
나이 - 정수, 나이는 1 ~ 199를 정상 입력으로 간주하고 이외의 값이 오면, 재 입력 요구
성별 - 문자 'M', 'F' 입력 받고, "남성"과 "여성"으로 출력
직업 - 정수로 입력 (1. 학생 / 2. 회사원 / 3. 주부 / 4. 무직) 1 ~ 4 이외의 값이 오면 재 입력 요구
결과는 한번에 출력
*/
public class MemberInfo {
    // 인스턴스 필드 (객체)
    String name;
    int age;
    char gender;
    int jobs;

    Scanner sc = new Scanner(System.in);

    public void setName() {                 // 결과값을 반환해 줄것이 없으면 void.
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();               // 문자형으로 입력받음
    }
    public void setAge() {
        while(true) {
            System.out.print("나이를 입력하세요: ");
            age = sc.nextInt();
            if(age > 0 && age < 200) return;    // return은 반복문을 빠져나가는 용도는 아니지만,
                                                // 반환값을 가지고 선언된 곳으로 되돌아가는 기능이 있음.
                                                // main에서 return 쓰면 main을 나와버림.
            System.out.println("나이를 잘 못 입력 하셨습니다.");
            // else가 할 역할이 없어서 안넣음.
        }
    }
    public void setGender() {
        while (true) {
            System.out.print("성별을 입력해주세요: ");
            gender = sc.next().charAt(0);
            switch (gender) {
                case 'M' :
                case 'm' :
                case 'F' :
                case 'f' :
                    return;
                default:
                    System.out.println("성별을 잘 못 입력 하셨습니다.");
            }
        }
    }
    public void setJobs() {
        while (true) {
            System.out.print("직업을 입력 하세요 : ");
            jobs = sc.nextInt();
            if(jobs > 0&& jobs < 5) break;
            System.out.print("직업을 잘 못 입력 하셨습니다.");
        }
    }

    public int getGenderType() {                                // 성별에 번호 붙여주기
        if (gender == 'M' || gender == 'm') return 1;           // '참'이면 1로 반환.
        else return 2;                                          // '거짓'이면 2로 반환 → 여성으로 받음
    }

    public void getInfo() {
        String[] genderStr = {"", "남성", "여성"};              // 0번째 빈칸인건 쌤 스타일임. 현실 세계랑 맞추기 위해서.
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};   // 직업별 번호 부여
        System.out.println("=".repeat(5) + "회원 정보" + "=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobsStr[jobs]);
    }

}
