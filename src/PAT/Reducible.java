package PAT;

import java.util.Scanner;

/**
 * Created by 张宝宁 on 2015/11/25.分数可以表示为分子/分母的形式。编写一个程序，要求用户输入一个分数，
 * 然后将其约分为最简分式。最简分式是指分子和分母不具有可以约分的成分了。如6/12可以被约分为1/2。当分子大于分母时，
 * 不需要表达为整数又分数的形式，即11/8还是11/8；而当分子分母相等时，仍然表达为1/1的分数形式。
 输入格式：

 输入在一行中给出一个分数，分子和分母中间以斜杠/分隔，如：12/34表示34分之12。
 分子和分母都是正整数（不包含0，如果不清楚正整数的定义的话）。

 提示：在scanf的格式字符串中加入/，让scanf来处理这个斜杠。
 输出格式：

 在一行中输出这个分数对应的最简分式，格式与输入的相同，即采用分子/分母的形式表示分数。如 5/6表示6分之5。
 */
public class Reducible {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String INPUT = sc.nextLine();
        String[] st = INPUT.split("/");
        int []number = new int[2];
        number[0] = Integer.parseInt(st[0]);
        number[1] = Integer.parseInt(st[1]);

        //System.out.println(number[0]);
    for(int i=number[1];i>=1;i--){
        if(number[0]%i==0&&number[1]%i==0){
            System.out.println(number[0]/i+"/"+number[1]/i);
            break;
        }
    }

    }
}
