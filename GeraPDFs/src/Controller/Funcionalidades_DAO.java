package Controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

public class Funcionalidades_DAO {

    // Função para gerar Receita Médica
    public static void receitaMedica() throws Exception {
        String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente:");
        String medicamento = JOptionPane.showInputDialog("Digite o medicamento prescrito:");
        String dosagem = JOptionPane.showInputDialog("Digite a dosagem:");

        Document doc = new Document(PageSize.A4, 72, 72, 72, 72);
        OutputStream os = new FileOutputStream("ReceitaMedica.pdf");
        PdfWriter.getInstance(doc, os);
        doc.open();

        // Adicionando imagem
        adicionarImagem(doc);

        // Adicionando conteúdo
        doc.add(new Paragraph("Receita Médica\n\n", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 18, com.itextpdf.text.Font.BOLD)));
        doc.add(new Paragraph("Paciente: " + nomePaciente));
        doc.add(new Paragraph("Medicamento: " + medicamento));
        doc.add(new Paragraph("Dosagem: " + dosagem));
        doc.add(new Paragraph("\n\nAssinatura do Médico: ________________________"));
        doc.add(new Paragraph("Carimbo: ___________________________"));

        doc.close();
        os.close();
        abrirDocumento("ReceitaMedica.pdf");
    }

    // Função para gerar Atestado Médico
    public static void atestadoMedico() throws Exception {
        String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente:");
        String data = JOptionPane.showInputDialog("Digite a data do atestado:");
        String motivo = JOptionPane.showInputDialog("Digite o motivo do atestado:");

        Document doc = new Document(PageSize.A4, 72, 72, 72, 72);
        OutputStream os = new FileOutputStream("AtestadoMedico.pdf");
        PdfWriter.getInstance(doc, os);
        doc.open();

        // Adicionando imagem
        adicionarImagem(doc);

        doc.add(new Paragraph("Atestado Médico\n\n", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 18, com.itextpdf.text.Font.BOLD)));
        doc.add(new Paragraph("Paciente: " + nomePaciente));
        doc.add(new Paragraph("Data: " + data));
        doc.add(new Paragraph("Motivo: " + motivo));
        doc.add(new Paragraph("\n\nAssinatura do Médico: ________________________"));
        doc.add(new Paragraph("Carimbo: ___________________________"));

        doc.close();
        os.close();
        abrirDocumento("AtestadoMedico.pdf");
    }

    // Função para gerar Declaração de Compromisso
    public static void declaracaoCompromisso() throws Exception {
        String nomeDeclarante = JOptionPane.showInputDialog("Digite o nome do declarante:");
        String data = JOptionPane.showInputDialog("Digite a data:");
        String compromisso = JOptionPane.showInputDialog("Digite o compromisso:");

        Document doc = new Document(PageSize.A4, 72, 72, 72, 72);
        OutputStream os = new FileOutputStream("DeclaracaoCompromisso.pdf");
        PdfWriter.getInstance(doc, os);
        doc.open();

        // Adicionando imagem
        adicionarImagem(doc);

        doc.add(new Paragraph("Declaração de Compromisso\n\n", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 18, com.itextpdf.text.Font.BOLD)));
        doc.add(new Paragraph("Eu, " + nomeDeclarante + ", declaro que:\n"));
        doc.add(new Paragraph(compromisso));
        doc.add(new Paragraph("\nData: " + data));
        doc.add(new Paragraph("\n\nAssinatura: ________________________"));

        doc.close();
        os.close();
        abrirDocumento("DeclaracaoCompromisso.pdf");
    }

    // Função para adicionar imagem
    private static void adicionarImagem(Document doc) {
        try {
            // Tente mudar o caminho da imagem para o local correto em seu sistema
            Image logo = Image.getInstance("C:\\Users\\Laboratorio-Info\\Documents\\GeraPDFs\\src\\Images\\logo.png"); // O caminho para a imagem logo.png
            logo.setAlignment(Image.ALIGN_CENTER);
            logo.scaleToFit(150, 150);
            doc.add(logo);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar imagem: " + e.getMessage());
        }
    }

    // Função para abrir o documento gerado
    private static void abrirDocumento(String fileName) throws Exception {
        Desktop.getDesktop().open(new File(fileName));
        JOptionPane.showMessageDialog(null, fileName + " gerado com sucesso!");
    }
}
