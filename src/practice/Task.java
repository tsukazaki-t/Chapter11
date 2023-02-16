package practice;

public class Task {
	// メンバー変数
		// 日付
		private int date; // インスタンス変数
		// タスク内容
		private String content;  // インスタンス変数
		// 状態（trueで完了）
		private boolean done;  // インスタンス変数

		// コンストラクタを作成
		public Task(int date,String content) {
			//tjisで自分自身のインスタンスを指す変数として扱うことが出来る
			this.date = date;	
			this.content = content;
		}
		
		// doneメソッド
		// 状態を完了にする
		public void done() {
			System.out.println("タスク「" + content + "」を完了します。");
			done = true;
			}

		// printメソッド
		// タスク内容を表示する		
		public void print() {
			//(done == true)とは書かない。boolean型の変数がtrueであること前提で書く
			//false前提で書くのであれば(!done)のような書き方になる
			if(done){
				System.out.println(date + "のタスク「" + content + "」は完了しています。");
			}else {
				System.out.println(date + "のタスク「" + content + "」は未完了です。");
			}
			
		}
		
		}


