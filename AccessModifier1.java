package phase1;
		class defaultspecifier{
			void display() {
				System.out.println("This is default access modifier");
			}
		}
		public class AccessModifier1 {

			public static void main(String[] args) {
				System.out.println("default access modifier");
			defaultspecifier obj = new defaultspecifier();
				obj.display();

				

			}

		




	}


