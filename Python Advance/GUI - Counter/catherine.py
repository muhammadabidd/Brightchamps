import tkinter as tk


window = tk.Tk()   
window.title("SOMETHING IS GOING TO HAPPENED HERE")
window.geometry("500x500") 


label1 = tk.Label(text="HELLO")
label1.pack()


def thisisnotfunctioningfunction():
    print("The not functioned function just functioned")


button1 = tk.Button(text="Press me", command=thisisnotfunctioningfunction)
button1.pack()

label2 = tk.Label(text="You have press the button this many time")
label2.pack()

label3 = tk.Label(text="0", font=("Arial", 32), foreground="BLUE")
label3.pack()

label3.config(text="99")




window.mainloop()
