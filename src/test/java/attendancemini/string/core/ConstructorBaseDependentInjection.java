package attendancemini.string.core;

public class ConstructorBaseDependentInjection {
	/**
	 * Pertama yang kita lakukan untuk dependency nicection di @Component adalah menggunakan contructor parameter
	 * kita bisa menambahkan contructor yang memiliki parameter jika membutuhkan beanlain
	 * secara otomatis spring aan mencarikan bean tersebut dan ketika membuat bean @Component, Spring akan menggunakan bean yang dibutuhkan i constructor
	 * constructor base dependency injection hanya mendukung satu constructor, jadi pastikan hanya membuat satu constructor
	 * **/
}
