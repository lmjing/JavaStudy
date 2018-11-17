package Book;

public class Chapter6 {

	class CDInfo {
		String registerNo;
		String title;
		
		CDInfo(String registerNo, String title) {
			this.registerNo = registerNo;
			this.title = title;
		}
	}
	
	class MusicCDInfo extends CDInfo {
		String artist;
		String[] playlist;

		MusicCDInfo(String registerNo, String title, String artist, String[] playlist) {
			super(registerNo, title);
			this.artist = artist;
			this.playlist = playlist;
		}
	}
}