import tkinter as tk


window = tk.Tk()

window.title("First App")

greeting = tk.Label(text="WOKE SIAP BOS", foreground="white", background="BLACK",
                 font= ("Arial", 18))

greeting.pack()
window.geometry("500x500")  # Width=300, Height=200


greeting.config(text="Modified Text from config")
count = 0

def updatecount():
    global count
    count += 1
    greeting.config(text = f"Count : {count}")


button = tk.Button(justify="center", text="Ayam sayur", command=updatecount)

button.pack()







window.mainloop()


print("fininsh")