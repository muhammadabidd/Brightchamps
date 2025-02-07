import tkinter as tk
from tkinter import ttk

window = tk.Tk()

window.title("Registration Form")
window.geometry("500x500")  


label = tk.Label(text="Welcome", foreground="white", background="BLACK", font= ("Arial", 18))
label.pack()  

# Dropdown
def whencomboboxselectedfunction(event):
    print("YOU CHOSE  THIS: ", combobox1.get())


choices = ["Choice 1", "Choice 2", "Choice 3"]
combobox1 = ttk.Combobox(window, values= choices)
combobox1.set("Select an Option")
combobox1.bind("<<ComboboxSelected>>", whencomboboxselectedfunction)
combobox1.pack()

def cleantextform():
    entry1.delete(0, tk.END)

# Entry / Form
def getinputfromentry():
    print("YOU JUST INPUTTHIS : " , entry1.get())
    label.config(text=f"Welcome, {entry1.get()}")
    cleantextform()

entry1 = tk.Entry(width= 60, foreground= "blue")
entry1.pack()


buttonsubmitname = tk.Button(text="Submit", command= getinputfromentry)
buttonsubmitname.pack()




deleteButton = tk.Button(text="Delete form", command= cleantextform)
deleteButton.pack()








window.mainloop()