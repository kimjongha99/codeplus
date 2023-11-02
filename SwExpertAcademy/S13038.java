    package SwExpertAcademy;


    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    /*
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXxNn6GaPW4DFASZ&categoryId=AXxNn6GaPW4DFASZ&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=3

    교환학생

     */
    public class S13038 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//들어야 되는 수업 수
            int classNum = Integer.parseInt(br.readLine());

            //일주일 수업 일정
            int[] calender = new int[7] ;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<7; i++) {
                calender[i] = Integer.parseInt(st.nextToken());
            }

            // 첫 개강일마다의 최소 일수 계산
            int min = Integer.MAX_VALUE;
            for(int i=0; i<7; i++) {
                if(calender[i]==1) {
                    //i요일을 개강일로 할때 최소 일수 구하기
                    int start = i;
                    int cnt=0;

                    while(true) {
                        //수업듣기
                        if(calender[start%7]==1)
                            cnt++;
                        //일수 추가
                        start++;

                        //수업을 다 들었을때
                        if(cnt==classNum) {
                            min = Math.min(min, start -i);
                            break;
                        }
                    }
                }
            }

            //정답 출력
            System.out.println(min);
        }
}