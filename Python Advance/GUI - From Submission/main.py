import tkinter as tk
from tkinter import ttk


window = tk.Tk()
window.title("Registration Form")
window.geometry("500x500")  # Width=300, Height=200



label = tk.Label(text="Welcome", foreground="white", background="BLACK", font= ("Arial", 18))
label.pack()    



# Combobox
def oncomboboxchoice(event):
    selected_option = combobox.get()
    # label.config(f"You just selected : {selected_option}")
    print(f"You just selected : {selected_option}")

choices = ["C1", "C2", "C3"]
combobox = ttk.Combobox(window, values= choices)
combobox.set("Select an Option")
combobox.bind("<<ComboboxSelected>>", oncomboboxchoice)
combobox.pack(pady=12)




# Entry or Form
def getinput():
    userinput = nameentry.get()
    # label.config(f"User Input is  : {userinput}")
    print(f"User Input is  : {userinput}")
    
nameentry = tk.Entry(width= 60, foreground= "black")





#Button

submit_button = tk.Button(text="Submit Text")
submit_button.pack()

nameentry.pack()



window.mainloop()

