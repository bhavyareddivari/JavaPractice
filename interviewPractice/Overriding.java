package interviewPractice;

public class Overriding {
	String fname;
	String lname;
	int id;
	public Overriding(int id, String fname, String lname){
		this.id =id;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
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
		Overriding other = (Overriding) obj;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		return true;
	}
}
