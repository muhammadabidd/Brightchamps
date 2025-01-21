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
nameentry.pack()




#Button
submit_button = tk.Button(text="Submit Form", command=getinput)
submit_button.pack()






#Deleting Text
def delete_text():
    nameentry.delete(0, tk.END)
delete_button = tk.Button(text="Delete Form", command=delete_text)
delete_button.pack()




#Multiple Line Text
text_widget = tk.Text(window, height=10)

text_widget.pack()

initial_text = "Ini adalah initial text"
text_widget.insert(tk.END, initial_text)





#RadioButton
def show_selected_option():
    selected_option = selected_var.get()
    print(f"Selected value is {selected_option}")

selected_var = tk.StringVar()

radioButton1 = tk.Radiobutton(window, text = "Male", variable = selected_var, value="Male", command= show_selected_option, )
radioButton2 = tk.Radiobutton(window, text = "Female", variable = selected_var, value="Female", command= show_selected_option)

# radioButton1.grid(row=0, column=0)
# radioButton2.grid(row=0, column=1)


window.mainloop()

