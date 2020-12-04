import java.util.Scanner;

public class SegundaVersaoProjeto2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.println("DISCIPLINA GEOGRAFIA");
		System.out.print("Quantos alunos tem na turma? ");
		n = sc.nextInt();
		
		double[] prova1 = new double[n];
		double[] prova2 = new double[n];
		double[] proj1 = new double[n];
		double[] proj2 = new double[n];
		double[] ex1 = new double[n];
		double[] ex2 = new double[n];
		double[] media_bim1 = new double[n];
		double[] media_bim2 = new double[n];
		double[] media_sem = new double[n];
		double media_geral, soma_medias, maior, menor;
		int aprovados, reprovados, recup;
		
		for (i=0; i<n; i++) {
			System.out.print("Digite a nota da 1a prova do " +(i+1) +"o aluno: ");
			prova1[i] = sc.nextDouble();
			System.out.print("Digite a nota do 1o projeto do " +(i+1) +"o aluno: ");
			proj1[i] = sc.nextDouble();
			System.out.print("Digite a nota da 1a lista de exercícios do " +(i+1) +"o aluno: ");
			ex1[i] = sc.nextDouble();
			System.out.print("Digite a nota da 2a prova do " +(i+1) +"o aluno: ");
			prova2[i] = sc.nextDouble();
			System.out.print("Digite a nota do 2o projeto do " +(i+1) +"o aluno: ");
			proj2[i] = sc.nextDouble();
			System.out.print("Digite a nota da 2a lista de exercícios do " +(i+1) +"o aluno: ");
			ex2[i] = sc.nextDouble();
		}
		
		for (i=0; i<n; i++) {	
			media_bim1[i] = (prova1[i]*5) + (proj1[i]*3) + (ex1[i]*2) / 10;
			media_bim2[i] = (prova2[i]*5) + (proj2[i]*3) + (ex2[i]*2) / 10;
			
			media_sem[i] = media_bim1[i] + media_bim2[i] / 2;
		}
		
		soma_medias = 0;
		for (i=0; i<n; i++) {
			soma_medias = soma_medias + media_sem[i];
		}
		
		media_geral = soma_medias / n;
		System.out.print("Média geral da turma = ");
		System.out.println(String.format("%.2f", media_geral));
		
		
		for (i=0; i<n; i++) {
			maior = media_sem[0];
			if (media_sem[i] > maior) {
				maior = media_sem[i];
			}
			
			menor = media_sem[0];
			if (media_sem[i] < menor) {
				menor = media_sem[i];
			}
		}
		
		maior = media_sem[0];
		for (i=1; i<n; i++) {
			if(media_sem[i] > maior) {
				maior = media_sem[i];
			}
		}
		
		System.out.print("Maior nota =  ");
		System.out.println(maior);
		
		menor = media_sem[n];
		for (i=0; i<n-1; i++) {
			if(media_sem[i] < menor) {
				menor = media_sem[i];
			}
		}
		
		System.out.print("Menor nota =  ");
		System.out.println(menor);
		
		aprovados = 0;
		reprovados = 0;
		recup = 0;
		for (i=0; i<n; i++) {
			if (media_sem[i] >= 8.00) {
				aprovados = aprovados + 1;
			}
			else if (media_sem[i] >= 5.00 && media_sem[i] <= 7.90)
				recup = recup + 1;
			else {
				reprovados = reprovados + 1;
			}
		}
		
		System.out.print("Quantidade de alunos aprovados: ");
		System.out.println(aprovados);
		System.out.print("Quantidade de alunos que devem fazer a Avaliação Final: ");
		System.out.println(recup);
		System.out.print("Quantidade de alunos reprovados: ");
		System.out.println(reprovados);
		
		
		
		sc.close();	
	}
	
}

