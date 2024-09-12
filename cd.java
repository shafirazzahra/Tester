public class cd extends product{
    private String artist;
    private int numSong;
    private String label;

    public cd() {
        super();//mengakses Constructor Superclass
        artist = "";
        numSong = 0;
        label = "";
    }

    public cd(int number, String name, int quantity, double price, String artist, int numSong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }

    public  String getArtist() {
		return this.artist;
	}

    public void setString( String artist) {
		this.artist = artist;
	}

    public int getNumSong() {
		return this.numSong;
	}

    public void setInt( int NumSong) {
		this.numSong = NumSong;
	}

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override //membuat method yng sama dengan method di superclass
    public void print() {
        super.print();
        System.out.println("artist : "+artist);
        System.out.println("numSong : "+numSong);
        System.out.println("label : "+label);
    }
    

}
