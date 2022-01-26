public class Student extends Person {
	private float score;

	public Student() {}
	
	public Student(String name, int age, String gender, float score) {
		super(name, age, gender);
		this.score = score;
	}
	
	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "[\n" +
			"  name: " + this.getName() + "\n" + 
			"  age: " + this.getAge() + "\n" +
			"  gender: " + this.getGender() + "\n" +
			"  score: " + score + "\n" +
			"]";
	}
}
