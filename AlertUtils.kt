object AlertUtils {
    fun showEmergencyDialog(context: Context, message: String, location: String) {
        AlertDialog.Builder(context)
            .setTitle("⚠️ Emergency Alert")
            .setMessage("$message\nLocation: $location")
            .setPositiveButton("OK", null)
            .show()
    }
}
