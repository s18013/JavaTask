class Ex3{

	public String ex3_0(int n){

		if (n > 0) {
            return "その値は正です";
        }else {
		    return "その値は０か負です";
	    }
    }

	public int ex3_1(int n){

        if (n > 0) {
            return n;
        }else if (n == 0) {
            return 0;
        }else {
            return -1 * n;
        }

	}

	public String ex3_2(int a, int b){

        if (a % b == 0){
		    return String.format("%Sは%sの約数です", b, a);
        }else {
            return String.format("%sは%sの約数ではありません", b, a);
        }
	}

	public String ex3_3(int a, int b){
        if (a > b){
            return String.format("%sの方が大きいです", a);
        }else if (a == b){
            return "同じ値です";
        }else {
            return String.format("%sの方が大きいです", b);
        }

	}

	public String ex3_4(int a){

        if (a < 0){
            return "正でない整数値です";

        }else if (a % 5 == 0){
            return "その値は5で割り切れます"; 

        } else {
            return "その値は5で割り切れません"; 
        }

	}

	public String ex3_5(int a){

        if (a < 0){
            return "正でない整数値です";

        }else if (a % 10 == 0){
            return "その値は10の倍数です"; 

        } else {
            return "その値は10の倍数ではありません"; 
        }

	}


	public String ex3_6(int a){
        if (a < 0){
            return "正でない整数値です";

        }else if (a % 3 == 1){
            return "その値を3で割った余りは1です";

        }else if (a % 3 == 2){
            return "その値を3で割った余りは2です";

        }else {
            return "その値は3で割り切れます";
        }
    }

	public String ex3_7(int a){
         if (0 <= a && a < 60){
            return "不可";

        }else if (60 <= a && a < 70){
            return "可";

        }else if (70 <= a && a < 80){
            return "良";

        }else if (80 <= a && a <= 100){
            return "優";
        }else {
            return "範囲(0～100)外の値です";
        }
	}

	public double ex3_8(double a, double b){

        if (a > b){
            return a;
        }else {
            return b;
        }
	}

	public int ex3_9(int a, int b){

        if (a > b){
            return a - b;
        }else {
            return b - a;
        }
	}

	public String ex3_10(int a, int b){

        if (a > b){
            if (a - b <= 10){
                return "それらの差は10以下です";
            }else {
                return "それらの差は11以上です";
            }
        }else {
            if (b - a <= 10){
                return "それらの差は10以下です";
            }else {
                return "それらの差は11以上です";
            }
        }
   }
	public int ex3_11(int a, int b, int c){

        if (a < c && b < c){
            return Math.min(a, b);
        }else if (a < b && c < b){
            return Math.min(a, c);
        }else{
            return Math.min(b, c);
        }

	}

	public int ex3_12(int a, int b, int c){

        if(a >= b) {
            if(b >= c) {
                return b;
            }else if(a <= c) {
                return a;
            }else {
                return c;
            }

        }else if(a > c) {
            return a;

        }else if(b > c) {
            return c;

        }else {
            return b;
        }
    }


	public String ex3_13(int a){

        if (a >= 3 && a <= 5){
            return "春";
        }else if (a >= 6 && a <= 8){
            return "夏";
        }else if (a >= 9 && a <= 11){
            return "秋";
        }else if (a == 12 || a == 2 || a == 1){
            return "冬";
        }else{
            return "範囲(1～12)外の値です";
        }

	}
}

