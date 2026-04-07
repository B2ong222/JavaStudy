package access;

public class SpeakerMain1 {
    static void main() {
        Speaker1 speaker1 = new Speaker1(90);
        speaker1.volumeUp();    // 정상 증가
        speaker1.volume = 200;  // 직접 접근 수정 가능 (버그 발생!)
        speaker1.showVolume();  // 현재 음량: 200 (100 제한이 깨짐)
    }
}
