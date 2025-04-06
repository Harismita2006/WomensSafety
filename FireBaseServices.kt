val database = FirebaseDatabase.getInstance().getReference("alerts")

database.addValueEventListener(object : ValueEventListener {
    override fun onDataChange(snapshot: DataSnapshot) {
        snapshot.children.forEach {
            val message = it.child("message").value.toString()
            val location = it.child("location").value.toString()

            AlertUtils.showEmergencyDialog(context, message, location)
        }
    }

    override fun onCancelled(error: DatabaseError) {}
})
