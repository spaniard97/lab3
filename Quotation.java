class Quotation
{
    private String quotation;
    private String author;
    
    public Quotation(String quotation, String author)
    {
        this.quotation = quotation;
        this.author    = author;
    }
    
    public String getQuotation()
    {
        return quotation;
    }
    
    public String getAuthor()
    {
        return author;
    }
}