/**
 * 
 */
package AdaptarPattern;

/**
 * @author Toufiq
 *
 */
public class MediaPlayerAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//When Mp3 Player
		Mp3Player mp3Player = new Mp3Player();
		mp3Player.play();
		
		//When Mp4 player
		Mp4Player mp4Player = new Mp4Player();
		AdaptorForMediaPlayer adaptar = new AdaptorForMediaPlayer(mp4Player);
		adaptar.play();

	}

}

interface IPlayer{
	public void play();
}

class Mp3Player implements IPlayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("MP3 Music Playing...");
	}
	
}

class Mp4Player implements IPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Mp4 Music Playing...");
	}
	
}

class AdaptorForMediaPlayer extends Mp3Player{
	
	Mp4Player _Mp4Player;
	
	public AdaptorForMediaPlayer(Mp4Player mp4Player) {
		// TODO Auto-generated constructor stub
		_Mp4Player = mp4Player;
	}
	
	public void play(){
		_Mp4Player.play();
	}
}
