//クラスの宣言
public class Kamoku {
    String namae;
    int tensuu;

//コントラクタの宣言
    public Kamoku(String namae, int tensuu) {
    	this.namae = namae;
    	this.tensuu = tensuu;
		}

 //メソッドの宣言,科目の文字列の表現
    @Override
    public String toString() {
    	return namae + "は" + tensuu + "点";
    }
 }