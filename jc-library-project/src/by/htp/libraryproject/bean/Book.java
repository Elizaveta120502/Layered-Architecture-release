package by.htp.libraryproject.bean;

public class Book {

	private int idBook;
	private String title;
	private String author;
	private int numberofpages;
	private boolean childrenaccess;
	private boolean favourite;
	private boolean readornot;
	private String literaturetype;
	private int publicationyear;
	private String publishing;
	private String language;

	public Book(int idBook, String author, String title, int numberofpages, boolean favourite, boolean readornot,
			int publicationyear, String publishing, boolean childrenaccess, String language, String literaturetype) {
		this.setIdBook(idBook);
		this.author = author;
		this.title = title;
		this.numberofpages = numberofpages;
		this.favourite = favourite;
		this.readornot = readornot;
		this.publicationyear = publicationyear;
		this.publishing = publishing;
		this.childrenaccess = childrenaccess;
		this.language = language;
		this.literaturetype = literaturetype;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberofpages() {
		return numberofpages;
	}

	public void setNumberofpages(int numberofpages) {
		this.numberofpages = numberofpages;
	}

	public boolean getChildrenaccess() {
		return childrenaccess;
	}

	public void setChildrenaccess(boolean childrenaccess) {
		this.childrenaccess = childrenaccess;
	}

	public boolean getFavourite() {
		return favourite;
	}

	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}

	public boolean getReadornot() {
		return readornot;
	}

	public void setReadornot(boolean readornot) {
		this.readornot = readornot;
	}

	public String getLiteraturetype() {
		return literaturetype;
	}

	public void setLiteraturetype(String literaturetype) {
		this.literaturetype = literaturetype;
	}

	public int getPublicationyear() {
		return publicationyear;
	}

	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + (childrenaccess ? 1231 : 1237);
		result = prime * result + (favourite ? 1231 : 1237);
		result = prime * result + ((literaturetype == null) ? 0 : literaturetype.hashCode());
		result = prime * result + idBook;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + numberofpages;
		result = prime * result + publicationyear;
		result = prime * result + ((publishing == null) ? 0 : publishing.hashCode());
		result = prime * result + (readornot ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (childrenaccess != other.childrenaccess)
			return false;
		if (favourite != other.favourite)
			return false;
		if (literaturetype == null) {
			if (other.literaturetype != null)
				return false;
		} else if (!literaturetype.equals(other.literaturetype))
			return false;
		if (idBook != other.idBook)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (numberofpages != other.numberofpages)
			return false;
		if (publicationyear != other.publicationyear)
			return false;
		if (publishing == null) {
			if (other.publishing != null)
				return false;
		} else if (!publishing.equals(other.publishing))
			return false;
		if (readornot != other.readornot)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() +"Book idBook=" + idBook + ", title=" + title + ", author=" + author + ", numberofpages=" + numberofpages
				+ ", childrenaccess=" + childrenaccess + ", favourite=" + favourite + ", readornot=" + readornot
				+ ", genre=" + literaturetype + ", publicationyear=" + publicationyear + ", publishing=" + publishing
				+ ", language=" + language;
	}


}
