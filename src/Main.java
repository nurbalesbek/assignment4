interface Report {
    void generate();
}

class PDFReport implements Report {
    public void generate() {
        System.out.println("Генерация PDF-отчета");
    }
}

class DOCReport implements Report {
    public void generate() {
        System.out.println("Генерация DOC-отчета");
    }
}

class ExcelReport implements Report {
    public void generate() {
        System.out.println("Генерация Excel-отчета");
    }
}

interface ReportFactory {
    Report createReport();
}

class PDFReportFactory implements ReportFactory {
    public Report createReport() {
        return new PDFReport();
    }
}

class DOCReportFactory implements ReportFactory {
    public Report createReport() {
        return new DOCReport();
    }
}

class ExcelReportFactory implements ReportFactory {
    public Report createReport() {
        return new ExcelReport();
    }
}

public class Main {
    public static void main(String[] args) {
        ReportFactory factory = new DOCReportFactory(); // Здесь можно выбрать другую фабрику в зависимости от формата
        Report report = factory.createReport();
        report.generate();
    }
}
