package trilha.back.financys.entities;


//import com.fasterxml.jackson.annotation.JsonFormat;
//import java.time.LocalDate;

public class Lancamentos {


    private String name;
    private String description;
    private String type;
    private String amount;
    private String date;
    private boolean paid;
    private long categoryId;

    public Lancamentos() {
    }

    public Lancamentos(String name, String description, String type, String amount, String date,
                       boolean paid, long categoryId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

//    @Override
//    public String toString() {
//        return "Lancamentos{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", type='" + type + '\'' +
//                ", amount='" + amount + '\'' +
//                ", date='" + date + '\'' +
//                ", paid=" + paid +
//                ", categoryId=" + categoryId +
//                '}';
//    }

//    @JsonFormat (pattern = "dd/MM/yyyy")
//    private LocalDate dataEntry;
}
