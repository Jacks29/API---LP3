package src.main.controler;
import static spark.Spark.*;
public class montaPergunta {

	public static void main(String[] args) {
		get("/soma", (req, res) -> new GeraSoma_Sub().novoCalc() );
		get("/mult", (req, res) -> new GeraMulti_Div().novoCalc() );
		get("/regra", (req, res) -> new GeraRegradeTres().novoCalc() );
		get("/log", (req, res) -> new GeraLog().novoCalc() );
		get("/prob", (req, res) -> new GeraProbab().novoCalc() );
	}

}
