import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Ex4{

	public int [] ex4_1(int [] a){

        List<Integer> list = new ArrayList<Integer>();
        for (int tmp : a) {
            list.add((Integer)tmp);
        }

        Collections.sort(list);

        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
    }


	public int [] ex4_2(int [] a){

        List<Integer> list = new ArrayList<Integer>();
        for (int tmp : a) {
            list.add((Integer)tmp);
        }

        Collections.sort(list, Comparator.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
	}

	public String [] ex4_3(int [] a){

        String [] ret = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                ret[i] = "正";
            } else if (a[i] < 0) {
                ret[i] = "負";
            } else {
                ret[i] = "零";
            }
            return ret;
        }

	}

	public int ex4_4(int a){

       int val = a;
       int valLen = String.valueOf(val).length();

       return valLen;

	}

	public int ex4_5(int a){

        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum += i;
        }

	}

	public int [] ex4_6(int a){

        List<Integer> yaku = new ArrayList<Integer>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                yaku.add(i);
            }
        }

		int [] ret = new int[yaku.size()];

        for (int i = 0; i < ret.lenght; i++) {
            ret[i] = yaku.get(i);
        }
		return ret;
	}

	public boolean ex4_7(int a){

        Scanner sc = new Scanner(a);
        int n = sc.nextInt();

        if (a == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }else {
                return true;
            }

        }
	}

	public int ex4_8(int [] a){

		int sum = 0;

        for (int i : a){
            sum += i;
        }
		return sum;

    }

	public int ex4_9(int [] a){

        float sum = 0;

        for (int i : a) {
            sum += i;
        }

        int ret = Math.round(sum/a.length);

        return ret;
	}
}

