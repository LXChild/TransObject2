package dataTransmit;

import android.os.Parcel;
import android.os.Parcelable;

public class Obj2 implements Parcelable{
	private String name;
	private String age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static Parcelable.Creator<Obj2> CREATOR = new Creator<Obj2>() {

		@Override
		public Obj2 createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			Obj2 obj2 = new Obj2();
			obj2.setName(source.readString());
			obj2.setAge(source.readString());
			return obj2;
		}

		@Override
		public Obj2[] newArray(int size) {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(name);
		dest.writeString(age);
	}

}
