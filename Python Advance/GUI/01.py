import tkinter as tk
from time import strftime

root = tk.Tk()
root.title("Centered Digital Clock with Date")
root.geometry("400x250")
root.configure(bg='black')

# Configure rows and columns to expand equally
root.grid_rowconfigure(0, weight=1)
root.grid_rowconfigure(1, weight=1)
root.grid_columnconfigure(0, weight=1)

# Create a label for the time
time_label = tk.Label(root, font=("Helvetica", 48), bg="#f4f4f4", fg="cyan")
time_label.grid(row=0, column=0, sticky="nsew")

# Create a label for the date
date_label = tk.Label(root, font=("Helvetica", 24), bg="#fff123", fg="white")
date_label.grid(row=1, column=0, sticky="nsew")

def update_time():
    current_time = strftime("%H:%M:%S")
    current_date = strftime("%A, %d %B %Y")  # e.g., "Friday, 07 February 2025"
    time_label.config(text=current_time)
    date_label.config(text=current_date)
    time_label.after(1000, update_time)

update_time()
root.mainloop()
