
public record ResConversiones(
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result
) {
    @Override
    public String toString() {
        return String.format( "%s son %.2f %s\n",
                this.base_code(),
                this.conversion_result(),
                this.target_code()
        );
}

}
