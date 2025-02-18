import tkinter as tk
from tkinter import messagebox

class AddressBookApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Address Book")
        self.root.geometry("500x500")

        # Labels and Entry fields
        tk.Label(root, text="Name:").grid(row=0, column=0, padx=5, pady=5, sticky="e")
        self.name_entry = tk.Entry(root)
        self.name_entry.grid(row=0, column=1, padx=5, pady=5)

        tk.Label(root, text="Phone:").grid(row=1, column=0, padx=5, pady=5, sticky="e")
        self.phone_entry = tk.Entry(root)
        self.phone_entry.grid(row=1, column=1, padx=5, pady=5)

        tk.Label(root, text="Address:").grid(row=2, column=0, padx=5, pady=5, sticky="e")
        self.address_entry = tk.Entry(root)
        self.address_entry.grid(row=2, column=1, padx=5, pady=5)

        # Add Contact Button
        self.add_button = tk.Button(root, text="Add Contact", command=self.add_contact)
        self.add_button.grid(row=3, column=0, columnspan=2, pady=5)

        # Listbox for contacts
        self.contact_list = tk.Listbox(root, height=8, width=35)
        self.contact_list.grid(row=4, column=0, columnspan=2, padx=5, pady=5)

        # Buttons
        self.view_button = tk.Button(root, text="View Details", command=self.view_contact)
        self.view_button.grid(row=5, column=0, padx=5, pady=5)

        self.update_button = tk.Button(root, text="Update", command=self.update_contact)
        self.update_button.grid(row=5, column=1, padx=5, pady=5)

        self.delete_button = tk.Button(root, text="Delete", command=self.delete_contact)
        self.delete_button.grid(row=6, column=0, columnspan=2, pady=5)

        # Contact storage
        self.contacts = {}

    def add_contact(self):
        name = self.name_entry.get()
        phone = self.phone_entry.get()
        address = self.address_entry.get()

        if name:
            self.contacts[name] = (phone, address)
            self.contact_list.insert(tk.END, name)
            self.name_entry.delete(0, tk.END)
            self.phone_entry.delete(0, tk.END)
            self.address_entry.delete(0, tk.END)
        else:
            messagebox.showwarning("Warning", "Name is required!")

    def view_contact(self):
        selected = self.contact_list.curselection()
        if selected:
            name = self.contact_list.get(selected[0])
            phone, address = self.contacts[name]
            messagebox.showinfo("Contact Details", f"Name: {name}\nPhone: {phone}\nAddress: {address}")
        else:
            messagebox.showwarning("Warning", "Select a contact first!")

    def update_contact(self):
        selected = self.contact_list.curselection()
        if selected:
            name = self.contact_list.get(selected[0])
            self.name_entry.delete(0, tk.END)
            self.phone_entry.delete(0, tk.END)
            self.address_entry.delete(0, tk.END)
            self.name_entry.insert(0, name)
            self.phone_entry.insert(0, self.contacts[name][0])
            self.address_entry.insert(0, self.contacts[name][1])
            self.delete_contact()
        else:
            messagebox.showwarning("Warning", "Select a contact first!")

    def delete_contact(self):
        selected = self.contact_list.curselection()
        if selected:
            name = self.contact_list.get(selected[0])
            del self.contacts[name]
            self.contact_list.delete(selected[0])
        else:
            messagebox.showwarning("Warning", "Select a contact first!")

if __name__ == "__main__":
    root = tk.Tk()
    app = AddressBookApp(root)
    root.mainloop()
