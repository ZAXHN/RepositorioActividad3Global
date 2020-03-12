
from django import forms
from profesor.models import profesor #importamos la libreria para interactuar con la base de datos
#crear una clase para poder utilizar los datos
#Interactuar con los datos de las tablas
class profesorForm(forms.ModelForm):
    class Meta:
        model = profesor
        fields = "__all__"