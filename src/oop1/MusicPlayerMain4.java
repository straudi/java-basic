package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.on();
        player.volumeUp();
        player.volumeDown();
        player.volumeUp();
        player.showStatus();;
        //음악 플레이어 끄기
        player.off();
    }

}
