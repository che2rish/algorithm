package programmers;

import java.util.HashMap;

// 완주하기 못한 선수
public class ex02 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < participant.length; i++){
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }

        for(int i = 0; i < completion.length; i++){
            if(map.containsKey(completion[i])) {
                map.put(completion[i],map.getOrDefault(completion[i],0)-1);
            }
        }

        for(String s : map.keySet()){
            if(map.get(s) == 1){
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex02 T = new ex02();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(T.solution(participant,completion));
    }

}
